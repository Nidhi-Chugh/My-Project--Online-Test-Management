package beans;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Question 
{
	private BigInteger questionId;
	public String[] questionOptions = new String[4];
	private String QuestionTitle;
	private Integer questionAnswer;
	private BigDecimal questionMarks;
	private Integer chosenAnswer;
	private BigDecimal marksScored;
	public BigInteger getQuestionId() 
	{
		return questionId;
	}
	public void setQuestionId(BigInteger questionId)
	{
		this.questionId = questionId;
	}
	public String[] getQuestionOptions()
	{
		return questionOptions;
	}
	public void setQuestionOptions(String[] questionOptions)
	{
		this.questionOptions = questionOptions;
	}
	public String getQuestionTitle()
	{
		return QuestionTitle;
	}
	public void setQuestionTitle(String questionTitle) 
	{
		QuestionTitle = questionTitle;
	}
	public Integer getQuestionAnswer() 
	{
		return questionAnswer;
	}
	public void setQuestionAnswer(Integer questionAnswer) 
	{
		this.questionAnswer = questionAnswer;
	}
	public BigDecimal getQuestionMarks() 
	{
		return questionMarks;
	}
	public void setQuestionMarks(BigDecimal questionMarks)
	{
		this.questionMarks = questionMarks;
	}
	public Integer getChosenAnswer()
	{
		return chosenAnswer;
	}
	public void setChosenAnswer(Integer chosenAnswer) 
	{
		this.chosenAnswer = chosenAnswer;
	}
	public BigDecimal getMarksScored() 
	{
		return marksScored;
	}
	public void setMarksScored(BigDecimal marksScored) 
	{
		this.marksScored = marksScored;
	}	
}
