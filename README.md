Feedback Management System:

    Requirements:

        * A user can signup using with admin or student role.  (Done)
        * Admin can create a batch.(done)
        * Admin can assign a batch to a student. (Done)
        * An admin user can create/edit/delete questions for feedback for different batches.(done)
        * A student can see all the feedbacks for his assigned batch and submit the feedback.(done)
        * The admin can see the feedback of an individual student as well.(done)
        * The admin should be able to see all the feedbacks of students batchwise.(done)

currentlyWorkingIn: serviceImpl.createFeedback(String fId) ;

To fix:
1. check existing batch while creating a new batch.
2. do not print message in server ref(serviceImpl.createBatch).

Implimentation:

1.Entity

    a. Student

            //attributes
                name
                phoneNumber
                password
                batchId
                batchName
                profilePhotoUrl
                list<feedback>

            //Consructor
                Student(name,phoneNumber,password)

            //getter & setter

    b. Admin

            //attributes
                name
                phoneNumber
                password
                profilePhotoUrl

            //Consructor
                Admin(name,phoneNumber,password)

            //getter & setter
    
    c. Batch

        //attributes
            name
            bId
            feedbackTemplate    --> It stores the batch template Feedback object.
            list<Student>
            list<feedback>

        //constructor
            Batch(name,bId)

        //behavior
            addStudent(Student student)
            addFeedback(Feedback feedback)

    d. Feedback

            //attributes
                fID
                studentPhoneNumber
                list<Question>
            
            //constructor
                Feedback(fId,questionList)
            
            //copy constuctor
                Feedback(Feedback feedbackTemplate)  ---> It copies the questionList of feedbackTemplate to the new feedback object.

            //getter & setter

    e. Question

            //attributes
                question
                answer

            //constuctor
                Question(question)

            //getter & setter
                
2.UiClient

    a.UiClient

        signup(name,phoneNumber,password,"student"/"admin")   -----> call Controller signup function.
        signin(phoneNumber,password,"student"/"admin")        -----> call Controller signin function.
        createBatch(AdminPhoneNumber,batchName,bId)                         -----> call Controller createBatch function.
        assignBatch(AdminPhoneNumber,StudentPhoneNumber,bId)      -----> call Controller assingBatch function.
        createFeedback(fId,bId,questionList)        ----> call controller createBatch function.
        editFeedbackQuestion(bId,questionNumber,editedQuestion)                   ----> call controller createBatch function.
        deleteQuestion(bId,questionNumber)          ---> call controller deleteQuestion function..
        showMyBatchFeedbacks(studentPhoneNumber)      ---> call controller showMyBatchFeedback function.
        submitFeedback(StudentPhoneNumber,bId,AnswerList)       ----> call controller submitFeedback function
        showFeedbackOfStudent(StudentPhoneNumber)          ---> call controller showFeedbackOfStudent function
        showBatchFeedback(bId)                  ---> call cotroller showBatchFeedback function


3.Controller

    a.Controller

        //attributes
            object of Service
            
        //behavior
            void signup(name,phoneNumber,password,role)             -----> call Service signup() function.
            boolean signin(phoneNumber,password)                    -----> call Service signin() functon.
            void createBatch(adminPhoneNumber,batchName,bId)                      -----> call service createBatch() function.
            void assignBatch(adminPhoneNumber,studentPhoneNumber,bId)   -----> call Service assignBatch() function.
            void createFeedback(fId,bId,questionList)    ---> call service createFeedback() function
            editFeedbackQuestion(bId,questionNumber,editedQuestion)                   ----> call service editFeedbackQuestion() function.
        
            deleteQuestion(bId,questionNumber)          ---> call service deleteQuestion function
            showMyBatchFeedback(StudentPhoneNumber)       ---> call service showMyBatchFeedback function
            submitFeedback(StudentPhoneNumber,bId,AnswerList) ---> call service submitFeedback function
            showFeedbackOfStudent(StudentPhoneNumber)              ---> call service showFeedbackOfStudent function
            showBatchFeedback(bId)                                  ---> call service showBatchFeedback function

4.Service

    a.Service

        //attributes
            object of StudentRepository.
            object of AdminRepository.
            object of BatchRepository.

        //behavior
            void signup(name,phoneNumber,password,role)             ----> create an appropriate object and save it in the  repository  by calling save() function of respective repository.
            boolean signin(phoneNumber,password,role)               ----> fetch matching phoneNumber user from respective Repository and match password . after succesfull authentication return true.
            void createBatch(adminPhoneNumber,batchName,bId)                      ----> authenticate admin then create a batch object and call save() of BatchRepository.
            void assignBatch(adminPhoneNumber,studentPhoneNumber,bId)   ----> authenticate admin then fetch the matching student and set its batch and call addStudentToBatch() of BatchRepository.
            void createFeedback(fId,bId,questionList)            ---->create a Feedback object and set it to the respective batch feedbackTemplate.
            void editFeedbackQuestion(bId,questionNumber,editedQuestion)          ----> fetchBatch->replace the provided question no. with new question.
            void deleteQuestion(bId,questionNumber)                     ---->fetchBatch->delete the provided question number from feedbackTemplate.
            List<Feedback> showMyBatchFeedback(StudentPhoneNumber)        ----> fetch Student's batch --> return its feedback list.
            void submitFeedback(StudentPhoneNumber,bId,answerList)      ----> fetch batch -->make a clone object of feedbackTemplate of the batch-->set the answers respectively in the questionList and studentPhone number then add the clone obj in the feedbackList.
            List<Feedback> showFeedbackOfStudent(StudentPhoneNumber)           ----> fetch student's batch --> search for the feedbacks submited by the student and return its list.
            List<Feedback> showBatchFeedback(bId)                              ---> fetchBatch ---> return the batch feedbackList.


5.Repository

    a.StudentRepository

        //attributes
            list<student>
            

        //behavior
            void save(Student obj)                      ----> it will add obj in the  appropriate list according to role provided.
            Student fetchStudent(studentPhoneNumber)    ----> It will search student from list and returns it.
    
    b.AdminRepository

        //attributes
            list<Admin>

        //behavior
            void save(Admin obj)                      ----> it will add obj in the list appropriate list according to role provided.
            Admin fetchAdmin(AdminPhoneNumber)          ----> It will search admin from list and return it.
            boolean isAdmin(adminPhoneNumber)           ----> searches for admin and true if found.

    c. BatchRepository

        //attributes
            list<Batch>

        //behavior 
            void save(Batch obj)           ----> It will add the obj in the batch list.
            Batch fetchBatch(String bId)   ----> It will return the matching batch obj.
            void addStudentToBatch(Student obj,bId)  ----> It will add the student in respective batch's students list.

    
    
    
