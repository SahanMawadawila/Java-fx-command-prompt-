package com.example.assignment6;

public class CommandExecutionExample {
    public static String execute (String cmd){
        String st="";
        try {
            // Specify the command you want to execute
            String command = cmd; // Replace with your desired command

            // Execute the command
            Process process = Runtime.getRuntime().exec(command);
            //String st = "";
            // Read the output of the command
            java.util.Scanner scanner = new java.util.Scanner(process.getInputStream());
            st = scanner.nextLine();
            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                st = st + scanner.nextLine()+"\n";

            }


            // Close the scanner
            scanner.close();

            // Wait for the command to complete
            int exitCode = process.waitFor();
            System.out.println("Command executed with exit code: " + exitCode);
            System.out.print(st);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return st;
    }
}