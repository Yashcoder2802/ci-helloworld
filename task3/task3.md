# Task 3 deliverables

- GitHub repo URL: https://github.com/Yashcoder2802/ci-helloworld.git
- Docker Hub image URL: https://hub.docker.com/r/yashsal2802/ci-helloworld

Notes:
- Workflow is in `.github/workflows/gradle.yml` and follows the CI tutorial structure: build/test, Jacoco coverage generation, and Docker publish in a separate dependent job.
- Configure repo secrets `DOCKER_USERNAME`, `DOCKER_PASSWORD`, and `DOCKER_REPO` where `DOCKER_REPO` is `docker_hub_user/ci-helloworld`.
- The workflow publishes both `latest` and `${{ github.sha }}` tags to Docker Hub. Make the Docker Hub repository public for grading.
