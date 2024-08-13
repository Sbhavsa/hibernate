package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class answer {
	@Id
    private int a_id;
    private String answer;
    @OneToOne
    private question que_id;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public question getQue_id() {
		return que_id;
	}
	public void setQue_id(question que_id) {
		this.que_id = que_id;
	}
	@Override
	public String toString() {
		return "answer [a_id=" + a_id + ", answer=" + answer + ", que_id=" + que_id + "]";
	}
	public answer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
}
