package com.example.webservice.todo;

import java.util.Date;

public class Todo {

		private long id;
		public String description;
		public boolean status;
		public Date targetDate;
		
		protected Todo() {
			
		}

		public Todo(long id, String description, boolean status, Date targetDate) {
			super();
			this.id = id;
			this.description = description;
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
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public Date getTargetDate() {
			return targetDate;
		}

		public void setTargetDate(Date targetDate) {
			this.targetDate = targetDate;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + (status ? 1231 : 1237);
			result = prime * result + ((targetDate == null) ? 0 : targetDate.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Todo other = (Todo) obj;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (id != other.id)
				return false;
			if (status != other.status)
				return false;
			if (targetDate == null) {
				if (other.targetDate != null)
					return false;
			} else if (!targetDate.equals(other.targetDate))
				return false;
			return true;
		}
		
		
		
}
