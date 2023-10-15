import random
import string

# Simulate a user database with email and password records
user_database = {
    "user1@example.com": "password123",
    "user2@example.com": "securepass",
}

# Function to generate a random password
def generate_password(length=12):
    return ''.join(random.choice(string.ascii_letters + string.digits + string.punctuation) for _ in range(length))

# Function to send a password reset email (you can reuse the previous email code)
def send_password_reset_email(email, reset_code):
    # Implement the email sending code from the previous example

# Function to reset the password
def reset_password(email, new_password):
    # Update the user's password in the database
    user_database[email] = new_password

# Example usage
if __name__ == "__main__":
    email = "user1@example.com"  # This would typically come from the user's input
    reset_code = "generated_reset_code"  # This should match the code sent in the reset email

    if email in user_database:
        new_password = generate_password()
        reset_password(email, new_password)
        print(f"Password reset for {email}. New password: {new_password}")
    else:
        print("Invalid email address.")
