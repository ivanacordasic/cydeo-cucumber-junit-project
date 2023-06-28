package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    @Then("user should see the list below")
    public void user_should_see_the_list_below(List<String> fruitsAndVegetables) {

        System.out.println(fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));

    }

    @Then("user should be able to see the list below")
    public void userShouldBeAbleToSeeTheListBelow(List<String> listOfPets) {

        System.out.println(listOfPets);

    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> personInfo) {

        System.out.println(personInfo);

        System.out.println("personInfo.get(\"name\") = " + personInfo.get("name"));
        System.out.println("personInfo.get(\"address\") = " + personInfo.get("address"));
        System.out.println("personInfo.get(\"age\") = " + personInfo.get("age"));

    }



}
