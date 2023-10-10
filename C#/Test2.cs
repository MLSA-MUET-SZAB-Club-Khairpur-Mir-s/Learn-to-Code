// C# program to print a new line
using System;
using System.IO;
using System.Text;

namespace IncludeHelp
{
    class Test2
    {
        // Main Method 
        static void Main(string[] args)
        {
            //using \n
            Console.WriteLine("Hello");
            //using \x0A
            Console.WriteLine("Hello\nAWorld");
            Console.WriteLine();
            Console.WriteLine("Hello\x0AWorld");
            Console.WriteLine();
            Console.WriteLine("Hello\x0AWorld");
            Console.WriteLine();

            Console.WriteLine("end program");

            //hit ENTER to exit the program
            Console.ReadLine();
        }
    }
}
