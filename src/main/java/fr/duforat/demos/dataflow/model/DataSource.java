package fr.duforat.demos.dataflow.model;

import org.springframework.data.annotation.Id;

public class DataSource {

	@Id
	private long id;
	
	private String kind;
	private String source;
	private String title;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
