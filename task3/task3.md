# Task 3 deliverables

- GitHub repo URL: https://github.com/Yashcoder2802/ci-helloworld.git
- Docker Hub image URL: docker.io/yashsal2802/ci-helloworld:780766a4cf7bbfffe142d6027127f5f8e52f97f6

Notes:
- Workflow is in .github/workflows/gradle.yml with fail-on-coverage-decrease and fail-on-branches-decrease enabled for jacoco-badge-generator.
- Docker image tag uses `${{ secrets.DOCKERHUB_USERNAME }}/ci-helloworld:${{ github.sha }}`; set DOCKERHUB_USERNAME and DOCKERHUB_TOKEN secrets in the repo and make the image public.
