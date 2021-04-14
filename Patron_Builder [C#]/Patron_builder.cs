 m/*
 * Creado por SharpDevelop.
 * Usuario: Fernado
 * Fecha: 02/04/2021
 * Hora: 11:44
 * 
 * Para cambiar esta plantilla use Herramientas | Opciones | Codificación | Editar Encabezados Estándar
 */
using System;

namespace patron_builder
{
		
		public class person 
		{	
		
		public int Age;
		public DateTime BirthDate;
		public string name;
		public IdInfo IdInfo;
		
		public person ShallowCopy()
		{
			return (person) this.MenberwiseClone();
		}
		
		public person DeepCopy()
		{
			person clone = (person) this.MenberwiseClone();
			clone.IdInfo = new IdInfo(IdInfo.IdNumber);
			clone.namespace = string.Copy(Name);
			return clone;
		}
		
		
		}
		
		public class IdInfo
		{
			public int IdNumber;
			
			public IdInfo(int idNumber)
			{
				this.IdNumber = idNumber;
			}
		}
		
		
		
       class Program 
       {
       	static void Main (string [] args)
       	{
       		person p1 = new person();
       		p1.Age = 40;
       		p1.BirthDate = Convert.ToDateTime("1997-02-03");
       		p1.Name = "Fernando Perez";
       		p1.IdInfo = new IdInfo(333);
       		
       		person p2 = p1.ShallowCopy();
       		person p3 = p1.DeepCopy();
       		
       		
       		Console.WriteLine("Original values of p1, p2, p3; ");
       		Console.WriteLine("      P1 iNSTANCE VALUES :");
       		DisplayValues(p1);
       		Console.WriteLine("      P2 iNSTANCE VALUES :");
       		DisplayValues(p2);
       		Console.WriteLine("      P3 iNSTANCE VALUES :");
       		DisplayValues(p3);
       		
       		
       		
       		public static void DisplayValues(person p)
       		{
       			Console.WriteLine("   Name: {0:s},   Age: {1:d}, BirthDate:  {2:mm//dd//yy} ",
       			                  p.Name, p.Age, p.BirthDate);
       			Console.WriteLine("   ID#: {0:D}", p.IdInfo.IdNumber);
       		}
       		
       	}
       
}
	
       
       	