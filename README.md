# QAP4 - Golf Tourney And Membership API
AUTHOR: Zachary Collier

DOCKER:
From the directory with the Dockerfile and docker-compose.yml, run the following in a terminal, in order:

```docker build -t golf-tourney-and-membership:latest```

```docker compose build```

```docker compose up```

From there, the API runs on http://localhost:8080.

WARNING: This repository has a VERY stubborn issue with infinite recursion. I plan to address this using Data Transfer Objects (DTOs) in the future. However, implementing them now, with most of the work already done, is an arduous task. As such, I am submitting this QAP with this issue while I work on it, all tests will occur in a local database to not incur AWS costs, and all photos of Postman will include this recursion.

It sucks, but I tried everything else suggested through research.