package com.minsu.mbti_server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MbtiController {

    @GetMapping("/questions")
    public Map<String, Object> questions() {
        Map<String, Object> questions = new HashMap<>();

        questions = resultQues();

        return questions;
    }

    @PostMapping("/answer")
    public Map<String, Object> answer() {
        Map<String, Object> answer = new HashMap<>();

        int e_cnt = 1;
        int i_cnt = 8;
        int s_cnt = 1;
        int n_cnt = 8;
        int t_cnt = 1;
        int f_cnt = 8;
        int j_cnt = 1;
        int p_cnt = 8;

        answer = resultType(e_cnt, i_cnt, s_cnt, n_cnt, t_cnt, f_cnt, j_cnt, p_cnt);

        return answer;
    }

    public Map<String, Object> resultQues() {

        Map<String, Object> result = new HashMap<>();

        List<String> type_e = new ArrayList<>();
        List<String> type_i = new ArrayList<>();
        List<String> type_s = new ArrayList<>();
        List<String> type_n = new ArrayList<>();
        List<String> type_t = new ArrayList<>();
        List<String> type_f = new ArrayList<>();
        List<String> type_j = new ArrayList<>();
        List<String> type_p = new ArrayList<>();

        type_e.add("나는 여러 친구들과 많이 사귀는 편이다.");
        type_e.add("계발활동을 갈 때 새로운 친구들을 만나는 것이 신난다.");
        type_e.add("처음 보는 친구들을 만나면 내가 먼저 말한다.");
        type_e.add("나의 생각이나 느낌을 다른 사람에게 이야기하는 편이다.");
        type_e.add("나는 친구들과 함께 하는 놀이가 좋다.");
        type_e.add("나는 많은 친구들에게 이야기하길 좋아한다.");
        type_e.add("친구들과 함께 공부하면 잘된다.");
        type_e.add("나는 나의 생각과 느낌을 말로 표현하는 것이 편하다.");
        type_e.add("주위 사람들은 내가 활발하다고 말한다.");

        type_i.add("나는 몇 명의 친구들과 깊이 사귀는 편이다.");
        type_i.add("새로운 계발활동 부서에 갈 때 처음 보는 친 구들과 앞으로 어떻게 지낼까 걱정이다.");
        type_i.add("처음 보는 친구들을 만나면 다른 친구가 나에게 먼저 말한다.");
        type_i.add("나의 생각이나 느낌을 내 마음 속에 간직하는 편이다.");
        type_i.add("나는 나 혼자 재미있게 하는 놀이가 좋다.");
        type_i.add("나는 친한 친구들에게 이야기하기를 좋아한다.");
        type_i.add("나 혼자 공부하면 더 잘 된다.");
        type_i.add("나는 나의 생각과 느낌을 글로 표현하는 것이 편하다.");
        type_i.add("주위 사람들은 내가 얌전하다고 말한다.");

        type_s.add("나는 친구들에게 내가 직접 보고 들은 것에 대 해 얘기하는 것을 좋아한다.");
        type_s.add("나는 실제로 있었던 사람이나 사실에 대한 책을 좋아한다.");
        type_s.add("어려운 일에 부딪히면 하던 일을 잘못 한다.");
        type_s.add("나는 무엇을 할 때 전에 배웠던 대로 하는 것이 편하다.");
        type_s.add("나는 그려진 그림에 색칠하기를 좋아한다.");
        type_s.add("나는 현재에 최선을 다하는 것이 중요하다고 생 각한다.");
        type_s.add("나는 선생님이 가르쳐 주신 방법대로 하는 편이다.");
        type_s.add("내가 좋아하는 책은 읽은 것이라도 또 읽는다.");
        type_s.add("나는 부지런하고 성실하다는 얘기를 듣는 편이다");

        type_n.add("난 친구들에게 내가 상상한 것을 이야기하는 것을 좋아한다.");
        type_n.add("나는 상상으로 지어낸 이야기를 좋아한다.");
        type_n.add("어려운 일에 부딪히면 도전하고 싶은 마음이 생긴다.");
        type_n.add("나는 무엇을 할 때 새로운 방법을 생각해서 해 볼 때 더 재미있다.");
        type_n.add("나는 이야기 지어내기를 좋아한다.");
        type_n.add("나는 미래에 대한 꿈을 갖는 것이 중요하다고 생각한다.");
        type_n.add("나는 나 스스로 나만의 방법을 만들어서 하는 편이다.");
        type_n.add("나는 새로운 다른 책을 읽는 것이 좋다.");
        type_n.add("나는 기발하고 엉뚱하다는 얘기를 듣는 편이다");

        type_t.add("나는 불공평한 것이 가장 나쁘다고 생각한다.");
        type_t.add("나는 공부 잘하는 실력 있는 학생으로 인정받고 싶다.");
        type_t.add("우리 편이 지면 다음 번에는 이기도록 계획을 짠다.");
        type_t.add("친구의 잘못된 점은 지적해 주는 편이다.");
        type_t.add("나는 공평한 사람이 되고 싶다.");
        type_t.add("달리기에서 이기면 기분이 아주 좋다.");
        type_t.add("나는 똑똑한 사람으로 인정받고 싶다.");
        type_t.add("도둑질을 하는 학생은 벌을 받아야 한다고 생각 한다.");
        type_t.add("벌금을 받을 때는 규칙대로 정확하게 받아야 한다.");

        type_f.add("나는 다른 사람의 마음에 상처를 주는 것이 가장 나쁘다고 생각한다.");
        type_f.add("나는 친구들 사이에서 인기가 좋은 학생으로 인정받고 싶다.");
        type_f.add("우리 편이 지면 ‘다음에 이기면 되지’하면 서 친구들의 기분을 좋게 해준다.");
        type_f.add("친구의 잘못된 점을 지적해 주면 친구가 어떻게 생각할까 걱정이 돼서 말하지 않는 편이다 ");
        type_f.add("나는 친절한 사람이 되고 싶다.");
        type_f.add("달리기에서 이기면 기분은 좋지만 진 사람은 기분이 어떨까 생각한다.");
        type_f.add("나는 따뜻한 사람으로 인정받고 싶다.");
        type_f.add("도둑질을 하는 학생은 도둑질을 하지 않도록 도움을 받아야 한다고 생각한다.");
        type_f.add("벌금을 받을 때는 상황에 따라 그 사람의 사정을 고려해서 받아야 한다.");

        type_j.add("내가 해야 할 일을 먼저 하고 논다.");
        type_j.add("수업 계획에 따라 차근차근 가르쳐 주시는 선생님이 좋다.");
        type_j.add("나는 정리정돈 된 깨끗한 방이 좋다.");
        type_j.add("하기 쉽게 잘 짜여진 숙제를 나는 좋아한다.");
        type_j.add("자전거를 탈 때 어디로 갈지 미리 생각하고 탄다.");
        type_j.add("나는 일기장이나 과제물을 잘 챙기는 편이다.");
        type_j.add("무엇을 공부해야 할지 자세히 가르쳐 주시는 선 생님이 좋다.");
        type_j.add("게임의 규칙은 절대로 바뀌어서는 안된다.");
        type_j.add("게임의 규칙은 절대로 바뀌어서는 안된다.");

        type_p.add("내가 할 수 있는 일이라면 먼저 재미있게 놀고 난 후에 해도 괜찮다.");
        type_p.add("그때그때마다 우리가 좋아하는 것에 맞추어 수업내용을 바꾸어서 가르치는 선생님이 좋다");
        type_p.add("나는 내 마음대로 흩어놓을 수 있는 방이 좋다.");
        type_p.add("새로운 방법으로 하는 숙제를 나는 좋아한다.");
        type_p.add("자전거를 탈 때 그냥 달리고 나서 어디로 갈 지 생각한다.");
        type_p.add("나는 일기장이나 과제물을 잘 잊어먹는 편이다.");
        type_p.add("우리들 스스로 송부할 것을 선택하도록 맡기시는 선생님이 좋다.");
        type_p.add("게임의 규칙은 경우에 따라 바뀔 수 있다.");
        type_p.add("나는 일을 그때 그때 해내는 편이다.");

        result.put("E_TYPE", type_e);
        result.put("I_TYPE", type_i);
        result.put("S_TYPE", type_s);
        result.put("N_TYPE", type_n);
        result.put("T_TYPE", type_t);
        result.put("F_TYPE", type_f);
        result.put("J_TYPE", type_j);
        result.put("P_TYPE", type_p);

        List<Map<String, Object>> quesList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {

            Map<String, Object> quesMap = new HashMap<>();

            quesMap.put("type1", "e");
            quesMap.put("value1", type_e.get(i));
            quesMap.put("type2", "i");
            quesMap.put("value2", type_i.get(i));
            quesList.add(quesMap);

            quesMap = new HashMap<>();
            quesMap.put("type1", "s");
            quesMap.put("value1", type_s.get(i));
            quesMap.put("type2", "n");
            quesMap.put("value2", type_n.get(i));
            quesList.add(quesMap);

            quesMap = new HashMap<>();
            quesMap.put("type1", "t");
            quesMap.put("value1", type_t.get(i));
            quesMap.put("type2", "f");
            quesMap.put("value2", type_f.get(i));
            quesList.add(quesMap);

            quesMap = new HashMap<>();
            quesMap.put("type1", "j");
            quesMap.put("value1", type_j.get(i));
            quesMap.put("type2", "p");
            quesMap.put("value2", type_p.get(i));
            quesList.add(quesMap);

        }

        result.put("quesList", quesList);

        return result;
    }

    public Map<String, Object> resultType(int e_cnt, int i_cnt, int s_cnt, int n_cnt, int t_cnt, int f_cnt, int j_cnt, int p_cnt) {

        Map<String, Object> result = new HashMap<>();

        String ISTJ = "실제 사실에 대하여 정확하게 체계적으로 기억하며 일처리에 신중하며 책임감이 강하다.";
        String ISTP = "말이 없으며 객관적으로 인생을 관찰하는 편이고 필요 이상으로 자신을 발휘하지 않는다.";
        String ESTP = "사실적이고 관대하며 개방적이고 사람이나 일에 대한 선입견이 별로 없다.";
        String ESTJ = "실질적이고 현실감이 뛰어나며 일을 조직하고 계획하여 추진시키는 능력이 있다.";
        String ISFJ = "책임감이 강하고 온정적이며 헌신적이고 침착하며 인내력이 강하다.";
        String ISFP = "말없이 다정하고 양털안감을 넣은 오버코트처럼 속마음이 따뜻하고 친절하다.";
        String ESFP = "현실적이고 실제적이며 친절하다. 어떤 상황이든 잘 적응하며 수용력이 강하고 사교적이다.";
        String ESFJ = "동정심이 많고 다른 사람에게 관심을 쏟으며 인화를 중시한다. 동료애가 많고 친절하다.";
        String INFJ = "창의력, 통찰력이 뛰어나며 강한 직관력으로 말없이 타인에게 영향력을 미친다.";
        String INFP = "마음이 따뜻하고 조용하며 자신이 관계하는 일에 대하여 책임감이 강하고 성실하다.";
        String ENFP = "온정적이고 창의적이며 항상 새로운 가능성을 찾고 시도한다.";
        String ENFJ = "민첩하고 동정심이 많고 사교적이며 인화를 중요시하고 참을성이 많다.";
        String INTJ = "행동과 사고에 있어서 독창적이며 강한 직관력과 의지와 결단력, 인내심이 있다.";
        String INTP = "과묵하나 관심이 있는 분야에 대해서는 말을 잘하며 이해가 빠르고 높은 직관력으로 통찰하는 재능과 지적 호기심이 많다.";
        String ENTP = "독창적이며 창의력이 풍부하고 넓은 안목을 갖고 있으며 다방면에 재능이 많다.";
        String ENTJ = "활동적이고 솔직하며 결정력과 통솔력이 있고 장기적 계획과 거시적 안목을 선호한다.";

        String ISTJ_JOB = "회계, 법률, 생산, 건축, 의료, 사무직, 관리직 등";
        String ISTP_JOB = "법률, 경제, 마켓팅, 판매통계분야 등";
        String ESTP_JOB = "의사, 군인, 검사, 경찰관, 운동가 등";
        String ESTJ_JOB = "사업가, 행정관리, 생산건축 등";
        String ISFJ_JOB = "의료, 간호, 교직, 사무직, 사회사업 등";
        String ISFP_JOB = "농장경영, 교통, 유흥업, 간호직, 비서직 등";
        String ESFP_JOB = "의료판매, 교통, 유흥업, 간호직, 비서직 등";
        String ESFJ_JOB = "교직, 성직, 판매, 간호, 의료분야 등";
        String INFJ_JOB = "성직, 심리치료와 상담, 예술과 문학 분야 등";
        String INFP_JOB = "언어, 학문, 문학, 상담 등";
        String ENFP_JOB = "상담, 교육, 저널리스트, 광고, 판매, 작가 등";
        String ENFJ_JOB = "교직, 성직, 심리상담, 예술, 문학 등";
        String INTJ_JOB = "과학, 엔지니어링, 발명, 정치, 철학 등";
        String INTP_JOB = "순수과학, 연구, 수학, 엔지니어링, 경제, 철학, 심리학 등의 학문";
        String ENTP_JOB = "발명가, 과학자, 언론, 마켓팅, 컴퓨터 분석 등";
        String ENTJ_JOB = "판매업, 건축업, 선장, 군인, 경찰관 등";

        if (e_cnt < i_cnt && s_cnt > n_cnt && t_cnt > f_cnt && j_cnt > p_cnt) {
            result.put("type", ISTJ);
            result.put("job", ISTJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt > n_cnt && t_cnt > f_cnt && j_cnt < p_cnt) {
            result.put("type", ISTP);
            result.put("job", ISTP_JOB);
        } else if (e_cnt > i_cnt && s_cnt > n_cnt && t_cnt > f_cnt && j_cnt < p_cnt) {
            result.put("type", ESTP);
            result.put("job", ESTP_JOB);
        } else if (e_cnt > i_cnt && s_cnt > n_cnt && t_cnt > f_cnt && j_cnt > p_cnt) {
            result.put("type", ESTJ);
            result.put("job", ESTJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt > n_cnt && t_cnt < f_cnt && j_cnt > p_cnt) {
            result.put("type", ISFJ);
            result.put("job", ISFJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt > n_cnt && t_cnt < f_cnt && j_cnt < p_cnt) {
            result.put("type", ISFP);
            result.put("job", ISFP_JOB);
        } else if (e_cnt > i_cnt && s_cnt > n_cnt && t_cnt < f_cnt && j_cnt < p_cnt) {
            result.put("type", ESFP);
            result.put("job", ESFP_JOB);
        } else if (e_cnt > i_cnt && s_cnt > n_cnt && t_cnt < f_cnt && j_cnt > p_cnt) {
            result.put("type", ESFJ);
            result.put("job", ESFJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt < n_cnt && t_cnt < f_cnt && j_cnt > p_cnt) {
            result.put("type", INFJ);
            result.put("job", INFJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt < n_cnt && t_cnt < f_cnt && j_cnt < p_cnt) {
            result.put("type", INFP);
            result.put("job", INFP_JOB);
        } else if (e_cnt > i_cnt && s_cnt < n_cnt && t_cnt < f_cnt && j_cnt < p_cnt) {
            result.put("type", ENFP);
            result.put("job", ENFP_JOB);
        } else if (e_cnt > i_cnt && s_cnt < n_cnt && t_cnt < f_cnt && j_cnt > p_cnt) {
            result.put("type", ENFJ);
            result.put("job", ENFJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt < n_cnt && t_cnt > f_cnt && j_cnt > p_cnt) {
            result.put("type", INTJ);
            result.put("job", INTJ_JOB);
        } else if (e_cnt < i_cnt && s_cnt < n_cnt && t_cnt > f_cnt && j_cnt < p_cnt) {
            result.put("type", INTP);
            result.put("job", INTP_JOB);
        } else if (e_cnt > i_cnt && s_cnt < n_cnt && t_cnt > f_cnt && j_cnt < p_cnt) {
            result.put("type", ENTP);
            result.put("job", ENTP_JOB);
        } else if (e_cnt > i_cnt && s_cnt < n_cnt && t_cnt > f_cnt && j_cnt > p_cnt) {
            result.put("type", ENTJ);
            result.put("job", ENTJ_JOB);
        }

        return result;
    }

}
