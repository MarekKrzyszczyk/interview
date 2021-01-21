using System;
using System.Collections.Generic;
using System.Text;

namespace Interview.Task4
{
    class ConsoleLogOutput : ILogOutput
    {
       
       public void Save(string serializedLogEntry)
        {
            Console.WriteLine(serializedLogEntry); ;
        }
    }
}
