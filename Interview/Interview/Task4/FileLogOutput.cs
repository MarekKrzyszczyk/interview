using System;
using System.Collections.Generic;
using System.Text;

namespace Interview.Task4
{
    class FileLogOutput : ILogOutput
    {
        private string _path;

        public FileLogOutput(string path)
        {
            _path = path;
        }

       

       public void Save(string serializedLogEntry)
        {
            System.IO.File.WriteAllText(_path, serializedLogEntry); ;
        }
    }
}
