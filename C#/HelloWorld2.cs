/*c# basic program to print messages*/
using System;

class HelloWorld2 {
	static void Main() {
		//print text without inserting new line after the message
		Console.Write("Hello World,");
		Console.Write("How are you?");
		//print new line
		Console.WriteLine();
		//print text with new line after the message
		Console.WriteLine("Hello World");
		Console.WriteLine("How are you?");
		//print new line using escape sequence just like C language
		Console.WriteLine("Hello World\nHow are you?");
	}
}
