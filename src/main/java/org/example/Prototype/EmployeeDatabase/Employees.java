package org.example.Prototype.EmployeeDatabase;

public interface Employees extends Cloneable{
    Employees makeCopy() throws CloneNotSupportedException;
}
