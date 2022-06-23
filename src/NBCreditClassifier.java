public class NBCreditClassifier {
    private UserInstanceBuilder instanceBuilder;
    public NBCreditClassifier(String name, TrainingSet ts,
                              UserInstanceBuilder instanceBuilder) {
        super(name, ts);
        this.instanceBuilder = instanceBuilder;
    }
    public Concept classify(Instance instance) {
        return super.classify(instance);
    }
    public Concept classify(User user) {
        return classify(instanceBuilder.createInstance(user));
    }
    public void useDefaultAttributes() {
        trainOnAttribute(CreditInstance.ATTR_NAME_JOB_CLASS);
        trainOnAttribute(CreditInstance.ATTR_NAME_INCOME_TYPE);
        trainOnAttribute(CreditInstance.ATTR_NAME_AGE);
        trainOnAttribute(CreditInstance.ATTR_NAME_CAR_OWNERSHIP);
        trainOnAttribute(CreditInstance.ATTR_NAME_CREDIT_SCORE);
        trainOnAttribute(
                ➥ CreditInstance.ATTR_NAME_MORTGAGE_DOWN_PAYMENT);
        trainOnAttribute(
                ➥ CreditInstance.ATTR_NAME_MOTOR_BICYCLE_OWNERSHIP);
        trainOnAttribute(
                ➥ CreditInstance.ATTR_NAME_OTHER_PROPERTY_OWNERSHIP);
        trainOnAttribute(CreditInstance.ATTR_NAME_CRIMINAL_RECORD);
        trainOnAttribute(CreditInstance.ATTR_NAME_BANKRUPTCY);
        trainOnAttribute(
                ➥ CreditInstance.ATTR_NAME_RETIREMENT_ACCOUNT);
    }
}
}
