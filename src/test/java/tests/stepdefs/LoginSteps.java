package tests.stepdefs;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user in on login page")
    public void user_in_on_login_page() {
        // Implementasi untuk membuka halaman login
        System.out.println("User berada di halaman login");
    }

    @When("user input email text box with {string}")
    public void user_input_email_text_box_with(String email) {
        // Implementasi untuk input email
        System.out.println("Input email: " + email);
    }

    @When("user input password text box with {string}")
    public void user_input_password_text_box_with(String password) {
        // Implementasi untuk input password
        System.out.println("Input password: " + password);
    }

    @When("user click login button")
    public void user_click_login_button() {
        // Implementasi klik tombol login
        System.out.println("Klik tombol login");
    }

    @Then("user will redirect to homepage")
    public void user_will_redirect_to_homepage() {
        // Implementasi verifikasi redirect ke homepage
        System.out.println("User dialihkan ke homepage");
    }

    @Then("user will see error message")
    public void user_will_see_error_message() {
        // Implementasi verifikasi error message
        System.out.println("User melihat pesan error");
    }
}
