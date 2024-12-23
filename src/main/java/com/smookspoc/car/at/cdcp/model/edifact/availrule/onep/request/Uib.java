/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request;


import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.DateTimeOfInitiation;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.InterchangeRecipient;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.InterchangeSender;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.SyntaxIdentifier;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.UibDialogueReference;

public class Uib {

    private SyntaxIdentifier syntaxIdentifier;
    private UibDialogueReference uibDialogueReference;
    private String transactionReference;
    private String scenarioIdentification;
    private String dialogueIdentification;
    private InterchangeSender interchangeSender;
    private InterchangeRecipient interchangeRecipient;
    private DateTimeOfInitiation dateTimeOfInitiation;

    public SyntaxIdentifier getSyntaxIdentifier() {
        return syntaxIdentifier;
    }

    public Uib setSyntaxIdentifier(SyntaxIdentifier syntaxIdentifier) {
        this.syntaxIdentifier = syntaxIdentifier;  return this;
    }

    public UibDialogueReference getUibDialogueReference() {
        return uibDialogueReference;
    }

    public Uib setUibDialogueReference(UibDialogueReference uibDialogueReference) {
        this.uibDialogueReference = uibDialogueReference;  return this;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public Uib setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;  return this;
    }

    public String getScenarioIdentification() {
        return scenarioIdentification;
    }

    public Uib setScenarioIdentification(String scenarioIdentification) {
        this.scenarioIdentification = scenarioIdentification;  return this;
    }

    public String getDialogueIdentification() {
        return dialogueIdentification;
    }

    public Uib setDialogueIdentification(String dialogueIdentification) {
        this.dialogueIdentification = dialogueIdentification;  return this;
    }

    public InterchangeSender getInterchangeSender() {
        return interchangeSender;
    }

    public Uib setInterchangeSender(InterchangeSender interchangeSender) {
        this.interchangeSender = interchangeSender;  return this;
    }

    public InterchangeRecipient getInterchangeRecipient() {
        return interchangeRecipient;
    }

    public Uib setInterchangeRecipient(InterchangeRecipient interchangeRecipient) {
        this.interchangeRecipient = interchangeRecipient;  return this;
    }

    public DateTimeOfInitiation getDateTimeOfInitiation() {
        return dateTimeOfInitiation;
    }

    public Uib setDateTimeOfInitiation(DateTimeOfInitiation dateTimeOfInitiation) {
        this.dateTimeOfInitiation = dateTimeOfInitiation;  return this;
    }
}