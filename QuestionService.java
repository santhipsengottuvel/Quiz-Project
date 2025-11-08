import java.util.*;
public class QuestionService{
    private Question[] questions;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] selection = new String[n];
    public QuestionService() {
        questions = new Question[n];
        for(int i=0;i<questions.length;i++) {
            
            System.out.println("Enter the "+(i+1)+"th question");
            System.out.println();
            System.out.println("Enter the id of question : ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the question : ");
            String ques = scan.nextLine();
            System.out.println("Enter op1 : ");
            String opt1 = scan.nextLine();
            System.out.println("Enter op2 : ");
            String opt2 = scan.nextLine();
            System.out.println("Enter op3 : ");
            String opt3 = scan.nextLine();
            System.out.println("Enter op4 : ");
            String opt4 = scan.nextLine();
            System.out.println("Enter ans : ");
            String ans = scan.nextLine();
            questions[i]=new Question(id,ques,opt1,opt2,opt3,opt4,ans);
        }
        
    }


    public void displayQuestion() {
        System.out.println("===== Display Questions =====");
        for(Question q : questions){
            System.out.println("ID : " + q.getId());
            System.out.println("Question : " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.println("Answer : " + q.getAnswer());
            System.out.println();
        }
    }

    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println("ID : " + q.getId());
            System.out.println("Question : " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.println("Give me the answer");
            selection[i++] = scan.nextLine();
            System.out.println();
        }
        for(String s : selection){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public void printScore(){
        int score = 0;
        for(int i=0;i<n;i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String givenAnswer = selection[i];
            if(answer.equals(givenAnswer)){
                score++;
            }
        }
        System.out.println("Your score is " + ((score/n)*100));
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}