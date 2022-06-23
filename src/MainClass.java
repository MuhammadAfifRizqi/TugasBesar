public class MainClass {
    public static void main(String[] args){
        UserDataset ds = UserLoader.loadTrainingDataset();
        NBCreditClassifier naiveBayes = new NBCreditClassifier(ds);
        naiveBayes.useDefaultAttributes();
        naiveBayes.train();
        UserDataset testDS = UserLoader.loadTestDataset();
        CreditErrorEstimator nb_err =
            ➥ new CreditErrorEstimator(testDS, naiveBayes);
        nb_err.run();
    }
}
