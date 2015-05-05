#include <iostream>
#include <string>

int main()
{
	std::string name;
	int age;
	std::string username;
	
	std::cout<<"Enter your name"<<std::endl;
	std::cin>>name;
	
	std::cout<<"Enter your age"<<std::endl;
	std::cin>>age;
	
	std::cout<<"Enter your username"<<std::endl;
	std::cin>>username;
	
	std::cout<< "Your name is " << name << ", you are " << age << " years old, and your username is " << username << "." << std::endl;

	return 0;
}
