# Lab-1
## Debugging and GitHub

This is the first lab for COMP 167 Computer Program Design at North Carolina A&T State University

Instructor: Professor Karen Schnell - klschnell@ncat.edu

The objective of this lab is to introduce you to git and GitHub, two tools that will be used _extensively_ this semester, as well as the IntelliJ IDE.

### What is Git?

Git is a system that allows developers to store multiple _versions_ of a single project, called **branches**. It also allows developers to keep their **local** copy of code up to date with **remote** copies. This has many advantages, mainly that it provides backup copies of code, and makes it easy to _collaborate_ with other developers in the same office, or across the world.

Git stores projects in special directories called **repositories**. A repository is nothing more than a directory, or folder, that has its changes tracked by git. Therefore, most small projects (and every project in this class) should be contained in a single git repository, or folder. You may not know this yet, but you've already created your first git repository! It is called "Lab-1-YOUR-USERNAME" and you're looking at the **remote** copy of this repository _right now_. This remote copy is hosted on GitHub.

### What is GitHub?

GitHub is a service that hosts remote repositories for millions of developers around the world. Companies like Apple, Google, Microsoft, RedHat, Adobe, Twitter, PayPal, and Facebook use GitHub to host their code. GitHub is also the world's largest host of open source projects, making it a treasure trove for young developers to learn from millions of projects.

In this class, we will complete all programming assignments on GitHub, this will allow TA's to easily check your work, and will protect your work from loss should anything happen to your computer.

### Setting Up for the Lab

Now that you know some of the basic terms, lets move into this lab. The first thing you must do is **clone** the repository, or create a **local** copy of the repository on your computer. to do this, you will need to launch the **git bash** app on your lab computer. If you are using your own computer, install git by following the instructions for your operating system on [the git website](https://www.git-scm.com).

   1. Clone the repository.
      * After opening git bash, create a directory to hold all of your git repositories. Type the command `mkdir COMP167` and press enter. Now, if you type the command `ls` and press enter you should see your new _COMP167_ directory listed. Change to this directory by entering `cd COMP167` and pressing enter.
      * You will need to acquire the link to your remote git repository. Click the green _Clone or Download_ button above these instructions and copy the link provided.
      * Finally, you can clone your repository by entering `git clone [PASTE-LINK-HERE]`. Note that the square brackets are only to separate your information from the actual command you should type. After pasing your link, you command should look something like this `git clone https://github.com/NCAT-COMP167-Spring2018-Lab-1-ccannon94.git`.
   2. Open the repository and project.
      * You must now navigate to your repository in git bash. First, run the `ls` command to view the contents of your current directory. You should only see one subdirectory, this is the repository you have just cloned. To navigate to your repository, run `cd [REPOSITORY-NAME-HERE]`.
      * Now that your repository is open in git bash, it's time to open IntelliJ, the IDE we will use in COMP167.

### What is an IDE?

An IDE, or an Integrated Development Environment, is a tool developers use when writing software. Good IDE's endeavor to make often repeated tasks as easy as possible for developers, as well as help developers avoid errors by providing services like autocompletion, linting, and debugging. 

### Opening the Project

For this lab, the IntelliJ project is already created for you. In future labs, you will learn how to create and configure your own Intellij project. If you do not have a license already to IntelliJ, you can get your license for IntelliJ for free using this link https://www.jetbrains.com/student/. We will be using IntelliJ IDEA Ultimate

   1. Launch the IntelliJ application.
   2. Select "File" and "Open Project". Navigate to your newly cloned repository and double-click on the project called _Contacts_.
   3. The left-hand side of your screen should show your project hierarchy, **source files**, or files ending in the .java file extension, are located under "Contacts -> src
         * All source files in a IntelliJ project will need to be located in a package. Source files not in a named package are said to be in the **default package**.
   4. Open all source files and take a look at the project you have been provided.

### Complete Contact.java

The "Contact.java" file is incomplete, and it is up to you to complete it! You can find the instructions in each comment marked `TODO`. _If you want the program to run correctly, please refer to the last section called Configure and Run._

### Commit and Push!

These steps are the _most important_ parts of this lab. Committing and pushing often is absolutely _essential_ to using git effectively. Every time you make a change, and that change works successfully, you should commit and push your work. This has two major benefits. **1)** Committing and pushing backs up your data against any hardware failure of your local machine. **2)** You can roll back to your last commit easily in git by using the command `git reset --hard`. Therefore, every time you succeed at something, you should commit, so that if your next change fails, you don't need to waste time undoing every single wrong thing you typed (trust me, there will be a lot in this class).

To commit and push, follow these steps:

   1. Save ALL files changed in IntelliJ.
   2. Return to your git bash window, and run the command `git add .`. In this case, the period represents your current working directory, and this command tells git to add all of your changes inside the current directory (your git repository) to the **staging area**, which means they are ready to commit.
   3. Run the command `git commit -m "[COMMIT-MESSAGE-HERE]"`. This will make a commit with a commit message of your choosing.
      * Commit messages should be no more than 55 characters, and should explain the change that this commit will make to your code. For example "Adds drag and drop functionality to ListView" or "Refactors while loop to include a base case" are excellent, concise, clear commit messages.
   4. Finally, run `git push` to **push** your local changes to your remote repository, which as we discussed, is hosted on GitHub.
      * At this point, you should refresh your GitHub page to see that your code has pushed successfully.

### Configure and Run

Now that the program is complete, it's time to watch it run on our machine! The first thing you have to do is make sure the project is configured to run correctly on your machine. We will do this with almost every assignment this semester:

  1. In the top right corner if it doesn't allow you to immediatley run the project this is because you have to create a configuration for your project. If the option to run the program is greyed out, click the button in the top right corner that says 'Add Configuration...'. Once you do that a window will pop up. In the top left corner of that window click the '+' button and choose application. For the name you are able to name it whatever you want, but it is good practice to name it something that will be beneficial like 'ContactsApp' since this is the configuration we are using to run the application as well as the file that contains our main method. Where it says 'Main Class' this is where you need to select which class you're trying to run that contains the main method you are using. Since our ContactsApp file has our main method we are using that one. IntelliJ will automatically show you which files have a main method. 
  2. Verify the the "Program Arguments" field has the value `contacts.csv`. This field is how you pass command-line arguments to your projects.
  3. Verify that the "Working Directory" field has the value `../`. This represents the directory one level _above_ your IntelliJ project, which is your git repository. All input files will be provided from the repository.
  4. Save these settings.
  5. Run your project by clicking the green arrow at the top right of the IntelliJ window.
