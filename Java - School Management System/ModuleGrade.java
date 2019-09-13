package application;

public class ModuleGrade {
String module; 
int grade;
public ModuleGrade(String module, int grade) {
	this.module = module;
	this.grade = grade;
}

public String getModule() {
		return module;
	}

public void setModule(String module) {
		this.module = module;
	}

public int getGrade() {
		return grade;
	}

public void setGrade(int grade) {
		this.grade = grade;
	}
public String toString()
{
	return module + " " + grade;
}
	}

