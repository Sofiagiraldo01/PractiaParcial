from locust import HttpUser, task

class ParkingUser(HttpUser):

    @task
    def calculate_fee(self):

        self.client.get(
            "/fee?minutes=91&vip=false"
        )