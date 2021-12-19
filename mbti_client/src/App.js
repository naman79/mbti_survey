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
    p_list: result['P_TYPE'],
    q_list: result['quesList']
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

  const [qList, setQList] = useState([{}]);
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
      setQList(value.q_list);
      setLoading(false);
    }));

  }

  return (
    <div className="App">
      <button onClick={onClickQuestions}>질문</button>
      <button onClick={onClickAnswer}>답변</button>
      {qList.map((val, idx) =>
        <li>
            <div>{val.value1}</div><div>{val.value2}</div>
        </li>
      )}
    </div>
  );

}

export default App;
