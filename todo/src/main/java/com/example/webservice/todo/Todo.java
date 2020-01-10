package com.example.webservice.todo;

import java.util.Date;

public class Todo {

		private long id;
		public String Description;
		public boolean status;
		public Date targetDate;
		public Todo(long id, String description,boolean status, Date targetDate ) {
			super();
			this.id = id;
			Description = description;
			this.status = status;
			this.targetDate = targetDate;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	
		
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public Date getTargetDate() {
			return targetDate;
		}
		public void setTargetDate(Date targetDate) {
			this.targetDate = targetDate;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
}
