package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class question {
	@Id
    private int q_id;
    private String question;
    @OneToOne 
    private answer ans_id;
	public answer getAns_id() {
		return ans_id;
	}
	public void setAns_id(answer ans_id) {
		this.ans_id = ans_id;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "question [q_id=" + q_id + ", question=" + question + ", ans_id=" + ans_id + "]";
	}
     
    
    
}
