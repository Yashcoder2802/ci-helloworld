# Task 3 deliverables

- GitHub repo URL: https://github.com/Yashcoder2802/ci-helloworld.git
- Docker Hub image URL: docker.io/yashsal2802/ci-helloworld:2f85f4dd604d34674aa0c167621ea4a3cfbc36d1

Notes:
- Workflow is in `.github/workflows/gradle.yml` and follows the CI tutorial structure: build/test, Jacoco coverage generation, and Docker publish in a separate dependent job.
- Configure repo secrets `DOCKER_USERNAME`, `DOCKER_PASSWORD`, and `DOCKER_REPO` where `DOCKER_REPO` is `docker_hub_user/ci-helloworld`.
- The workflow publishes both `${{ secrets.DOCKER_REPO }}:latest` and `${{ secrets.DOCKER_REPO }}:${{ github.sha }}`. Make the Docker Hub repository public for grading.
