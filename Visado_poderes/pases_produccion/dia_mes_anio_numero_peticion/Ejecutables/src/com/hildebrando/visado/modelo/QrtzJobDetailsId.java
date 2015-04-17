package com.hildebrando.visado.modelo;
// Generated 13-jun-2012 10:20:15 by Hibernate Tools 3.4.0.CR1



/**
 * QrtzJobDetailsId generated by hbm2java
 */
public class QrtzJobDetailsId  implements java.io.Serializable {


     private String jobName;
     private String jobGroup;

    public QrtzJobDetailsId() {
    }

    public QrtzJobDetailsId(String jobName, String jobGroup) {
       this.jobName = jobName;
       this.jobGroup = jobGroup;
    }
   
    public String getJobName() {
        return this.jobName;
    }
    
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getJobGroup() {
        return this.jobGroup;
    }
    
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof QrtzJobDetailsId) ) return false;
		 QrtzJobDetailsId castOther = ( QrtzJobDetailsId ) other; 
         
		 return ( (this.getJobName()==castOther.getJobName()) || ( this.getJobName()!=null && castOther.getJobName()!=null && this.getJobName().equals(castOther.getJobName()) ) )
 && ( (this.getJobGroup()==castOther.getJobGroup()) || ( this.getJobGroup()!=null && castOther.getJobGroup()!=null && this.getJobGroup().equals(castOther.getJobGroup()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getJobName() == null ? 0 : this.getJobName().hashCode() );
         result = 37 * result + ( getJobGroup() == null ? 0 : this.getJobGroup().hashCode() );
         return result;
   }   


}


