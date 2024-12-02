package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  // Ignore unknown fields during deserialization
public class ResponseItem {
	private String id;
	private String name;
    private String created;
    private String modified;
    private String permalink;
    private String type;
    private String date;
    private String status;
    private String parent_name;
    private String admission_id;
    private String end_date;
    private String pause_days;
    private String credit_debit_amount;
    private String transaction_type;
    private String transport_credits;
    private String attrition_reason;
    private String plan_id;
    private String time_slot;
    private String center_id;
    private String invoice_id;
    private String program_name;
    private String admission_plan;
    private String request_approved_by;
    private String request_approved_date;
    private String request_approval_status;
    private String request_approval_comment;
    private String processing_data;
    private String next_reminder_date;
    private String last_reminder_date;
    private String reminder_step;
    private String created_by;
    private String request_owner;
    private String other_info;
    private String parent_employee_code;
    private String parent_employee_email;
    private String parent_employer;
    private String monthly_invoicing_status;
    private String annual_invoicing_status;
    private String current_status;

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}
	public String getAdmission_id() {
		return admission_id;
	}
	public void setAdmission_id(String admission_id) {
		this.admission_id = admission_id;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getPause_days() {
		return pause_days;
	}
	public void setPause_days(String pause_days) {
		this.pause_days = pause_days;
	}
	public String getCredit_debit_amount() {
		return credit_debit_amount;
	}
	public void setCredit_debit_amount(String credit_debit_amount) {
		this.credit_debit_amount = credit_debit_amount;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getTransport_credits() {
		return transport_credits;
	}
	public void setTransport_credits(String transport_credits) {
		this.transport_credits = transport_credits;
	}
	public String getAttrition_reason() {
		return attrition_reason;
	}
	public void setAttrition_reason(String attrition_reason) {
		this.attrition_reason = attrition_reason;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getTime_slot() {
		return time_slot;
	}
	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}
	public String getCenter_id() {
		return center_id;
	}
	public void setCenter_id(String center_id) {
		this.center_id = center_id;
	}
	public String getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public String getAdmission_plan() {
		return admission_plan;
	}
	public void setAdmission_plan(String admission_plan) {
		this.admission_plan = admission_plan;
	}
	public String getRequest_approved_by() {
		return request_approved_by;
	}
	public void setRequest_approved_by(String request_approved_by) {
		this.request_approved_by = request_approved_by;
	}
	public String getRequest_approved_date() {
		return request_approved_date;
	}
	public void setRequest_approved_date(String request_approved_date) {
		this.request_approved_date = request_approved_date;
	}
	public String getRequest_approval_status() {
		return request_approval_status;
	}
	public void setRequest_approval_status(String request_approval_status) {
		this.request_approval_status = request_approval_status;
	}
	public String getRequest_approval_comment() {
		return request_approval_comment;
	}
	public void setRequest_approval_comment(String request_approval_comment) {
		this.request_approval_comment = request_approval_comment;
	}
	public String getProcessing_data() {
		return processing_data;
	}
	public void setProcessing_data(String processing_data) {
		this.processing_data = processing_data;
	}
	public String getNext_reminder_date() {
		return next_reminder_date;
	}
	public void setNext_reminder_date(String next_reminder_date) {
		this.next_reminder_date = next_reminder_date;
	}
	public String getLast_reminder_date() {
		return last_reminder_date;
	}
	public void setLast_reminder_date(String last_reminder_date) {
		this.last_reminder_date = last_reminder_date;
	}
	public String getReminder_step() {
		return reminder_step;
	}
	public void setReminder_step(String reminder_step) {
		this.reminder_step = reminder_step;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getRequest_owner() {
		return request_owner;
	}
	public void setRequest_owner(String request_owner) {
		this.request_owner = request_owner;
	}
	public String getOther_info() {
		return other_info;
	}
	public void setOther_info(String other_info) {
		this.other_info = other_info;
	}
	public String getParent_employee_code() {
		return parent_employee_code;
	}
	public void setParent_employee_code(String parent_employee_code) {
		this.parent_employee_code = parent_employee_code;
	}
	public String getParent_employee_email() {
		return parent_employee_email;
	}
	public void setParent_employee_email(String parent_employee_email) {
		this.parent_employee_email = parent_employee_email;
	}
	public String getParent_employer() {
		return parent_employer;
	}
	public void setParent_employer(String parent_employer) {
		this.parent_employer = parent_employer;
	}
	public String getMonthly_invoicing_status() {
		return monthly_invoicing_status;
	}
	public void setMonthly_invoicing_status(String monthly_invoicing_status) {
		this.monthly_invoicing_status = monthly_invoicing_status;
	}
	public String getAnnual_invoicing_status() {
		return annual_invoicing_status;
	}
	public void setAnnual_invoicing_status(String annual_invoicing_status) {
		this.annual_invoicing_status = annual_invoicing_status;
	}
	public String getCurrent_status() {
		return current_status;
	}
	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}
	    


}
