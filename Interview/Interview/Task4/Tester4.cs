using System;
using System.Threading.Tasks;

namespace Interview.Task4
{
    public class Tester4
    {
        public void Test()
        {
            var fileLogOutput = new FileLogOutput("c:\\Users\\acer\\csharp\\log.txt");
              var logger = new Logger(fileLogOutput);
            logger.Log(new LogEntry() { Message = "test", Tags = new[] { "t1", "t2" }, Timestamp = DateTime.UtcNow });

            var consoleLogOutput = new ConsoleLogOutput();
            var consoleLogger = new Logger(consoleLogOutput);
            consoleLogger.Log(new LogEntry() { Message = "test", Tags = new[] { "t1", "t2" }, Timestamp = DateTime.UtcNow });
        }
    }
}
