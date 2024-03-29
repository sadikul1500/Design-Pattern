# -*- coding: utf-8 -*-
"""strategy_pattern_new.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/13iIR3H2gfG-SlroePKqIyLVqvUbJveHY
"""

#!pip install python-interface
from abc import ABC, abstractmethod

#from interface import implements, Interface

class IConvertion(ABC): #ABC replaced Interface
    def convert(self, file): 
        pass

#@zope.interface.implementer(IConvertion) 
import csv

class ConvertToCSV(IConvertion): #implements(IConvertion)
  
  def convert(self, file):
    out = file + '_csv.csv'

    f = open(file, "r")
    lines = f.readlines()

    with open(out, 'w') as out_file:
      writer = csv.writer(out_file)
      for line in lines:
        writer.writerow((line.split()))
    #files.download(out)
    f.close()
    out_file.close()

#@zope.interface.implementer(IConvertion)
import json

class ConvertToJSON(IConvertion):
  def convert(self, file):
    out = file + '_json.json'

    f = open(file, "r")
    lines = f.readlines()

    dict1 = {}
    i = 0
    keys = None
    for line in lines:
      if not i:
        keys = list(line.split())
      else:
        values = list(line.split())
        dict2 = {}
        for j in range(len(keys)):
          dict2[keys[j]] = values[j]
        
        dict1[i] = dict2
      
      i += 1
    out_file = open(out, "w") 
    json.dump(dict1, out_file, indent = 4) 
    out_file.close()
    #files.download(out)

#@zope.interface.implementer(IConvertion)

class ConvertToXML(IConvertion):
  def convert(self, file):
    out = file + '_xml.xml'

    f = open(file, "r")
    lines = f.readlines()

    xmlFile = open(out, 'w')
    xmlFile.write('<?xml version="1.0" encoding="UTF-8"?>' + "\n")
    xmlFile.write('<BSSE10>' + "\n")

    keys = None
    i = 0

    for line in lines:
      if not i:
        keys = list(line.split())
        i += 1
      else:
        xmlFile.write('  <Student>' + "\n")
        values = list(line.split())
         
        for j in range(len(values)):
          xmlFile.write('    <' + keys[j] + '>' + values[j] + '</' + keys[j] + '>' + "\n")

        xmlFile.write('  </Student>' + "\n")
    
    xmlFile.write('<BSSE10>' + "\n")

    f.close()
    xmlFile.close()
    
    #files.download(out)

class Client:
  def __init__(self, convertion: IConvertion):
    self._convertion = convertion
  
  def getStrategy(self):
    return self._convertion

  def setStrategy(self, strategy):
    self._convertion = convertion

  def applyStrategy(self, file):
    self._convertion.convert(file)



#from google.colab import files
#uploaded = files.upload()


if __name__ == '__main__':

  f = open('input.txt', 'r')
#for f in uploaded.keys():
  for i in range(3):
    convertion = IConvertion
    choice = int(input('1.csv\n2.json\n3.xml\n'))
    client = None
    
    if choice == 1:
      client = Client(ConvertToCSV())
      #convertion = ConvertToCSV()
    elif choice == 2:
      client = Client(ConvertToJSON())
      #convertion = ConvertToJSON()
    elif choice == 3:
      client = Client(ConvertToXML())
      #convertion = ConvertToXML()
    #else:
    #  exit(0)

    #x = ConvertToXML
    #convertion.convert('input.txt')
    client.applyStrategy('input.txt')
