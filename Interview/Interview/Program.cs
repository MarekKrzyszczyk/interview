using Interview.Task5;
using Interview.Task4;
using System;
using System.Threading.Tasks;

namespace Interview
{
    class Program
    {
        static async Task Main(string[] args)
        {
            Console.WriteLine("Start");

            //var tester = new Tester5();
            //await tester.Test();

            var tester = new Tester4();
            tester.Test();

            Console.WriteLine("Stop");
            Console.ReadKey();
        }
    }
}
