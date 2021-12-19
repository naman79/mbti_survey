import logo from './logo.svg';
import './App.css';
import axios from "axios";
import {useState} from "react";

async function getQuestions() {
  const response = await axios.get(
      'http://localhost:8080/questions',
  );

  const result = response.data;
  const resultObj = {
    e_list: result['E_TYPE'],
    i_list: result['I_TYPE'],
    s_list: result['S_TYPE'],
    n_list: result['N_TYPE'],
    t_list: result['T_TYPE'],
    f_list: result['F_TYPE'],
    j_list: result['J_TYPE'],
    p_list: result['P_TYPE']
  };

  console.log(resultObj);
  return resultObj;
}

async function getAnswer() {
  const response = await axios.post(
      'http://localhost:8080/answer', {
        params: {
          i_cnt: 1
        }
      }
  );
  return response.data;
}

const onClickQuestions = () => {
  var result = getQuestions();
  console.log(result);
}

const onClickAnswer = () => {
  var result = getAnswer();
  console.log(result);
}


function App() {

  const [isLoading, setLoading] = useState(true);

  const [qList, setQList] = useState([]);
  const [eList, setEList] = useState([]);
  const [iList, setIList] = useState([]);
  const [sList, setSList] = useState([]);
  const [nList, setNList] = useState([]);
  const [tList, setTList] = useState([]);
  const [fList, setFList] = useState([]);
  const [jList, setJList] = useState([]);
  const [pList, setPList] = useState([]);

  const callQuestions = getQuestions();

  if(isLoading) {

    callQuestions.then((value => {

      var result;
      var q_list = null;
      var q_obj = {'type1':'', 'value1':'', 'type2':'', 'value2':''};

      setEList(value.e_list);
      setIList(value.i_list);
      setSList(value.s_list);
      setNList(value.n_list);
      setTList(value.t_list);
      setFList(value.f_list);
      setJList(value.j_list);
      setPList(value.p_list);

      for(var i =0 ; i < 9 ; i++) {

        q_obj['type1'] = 'e';
        q_obj['value1'] = value.e_list[i];
        q_obj['type2'] = 'i';
        q_obj['value2'] = value.i_list[i];
        q_list.push(q_obj);

        q_obj['type1'] = 's';
        q_obj['value1'] = value.s_list[i];
        q_obj['type2'] = 'n';
        q_obj['value2'] = value.n_list[i];
        q_list.push(q_obj);

        q_obj['type1'] = 't';
        q_obj['value1'] = value.t_list[i];
        q_obj['type2'] = 'f';
        q_obj['value2'] = value.f_list[i];
        q_list.push(q_obj);

        q_obj['type1'] = 'j';
        q_obj['value1'] = value.j_list[i];
        q_obj['type2'] = 'p';
        q_obj['value2'] = value.p_list[i];
        q_list.push(q_obj);

      }

      setQList(q_list);
      setLoading(false);
    }));

  }

  return (
    <div className="App">
      <button onClick={onClickQuestions}>질문</button>
      <button onClick={onClickAnswer}>답변</button>
      {qList}
    </div>
  );

}

export default App;
