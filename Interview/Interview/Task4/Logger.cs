using System.Text.Json;
using System.Xml.Serialization;

namespace Interview.Task4
{
    public class Logger : ILogger
    {
        private readonly ILogOutput _logOutput;

        public Logger(ILogOutput logOutput)
        {
            _logOutput = logOutput;
        }

        public void Log(LogEntry logEntry, Type type)
        {

            if (type == Type.Json)
            {
               var serializedLogEntry = JsonSerializer.Serialize(logEntry);
                _logOutput.Save(serializedLogEntry);
            }
            else
            {
                using (var stringwriter = new System.IO.StringWriter())
                {
                    var serializer = new XmlSerializer(typeof(LogEntry));
                    serializer.Serialize(stringwriter, logEntry);
                    _logOutput.Save(stringwriter.ToString());
                }
            }
           
        }
    }
}
