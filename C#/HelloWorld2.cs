/*c# basic program to print messages*/
using System;

class HelloWorld2 {
	static void Main() {
		//print text without inserting new line after the message
		Console.Write("Hello");
		Console.Writeln("How are you?");
		//print next line
		Console.WriteLine();
		//print text with new line after the message
		Console.WriteLine("Hello");
		Console.WriteLine("How are you?");
		//print new line using escape sequence just like C language
		Console.WriteLine("Hello\nHow are you?");
	}
}
