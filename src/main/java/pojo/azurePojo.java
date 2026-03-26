package pojo;

public class azurePojo {
	
	private int id;
	private String title;
	private String dueDate;
	private boolean completed;
	
	
	public azurePojo(int id, String title, String dueDate, boolean completed) {

		this.id = id;
		this.title = title;
		this.dueDate = dueDate;
		this.completed = completed;
	}
	public int getId() {
		return id;
		
	}
	public  String getTitle() {
		return title;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	public String getDueDate() {
		return dueDate;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "azurePojo [id=" + id + ", title=" + title + ", dueDate=" + dueDate + ", completed=" + completed + "]";
	}
	
	

}
