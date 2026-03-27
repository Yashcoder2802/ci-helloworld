# Task 3 deliverables

- GitHub repo URL: https://github.com/Yashcoder2802/ci-helloworld
- Docker Hub image URL: https://hub.docker.com/r/<DOCKERHUB_USERNAME>/ci-helloworld (update after first successful push)

Notes:
- Workflow is in .github/workflows/gradle.yml with fail-on-coverage-decrease and fail-on-branches-decrease enabled for jacoco-badge-generator.
- Docker image tag uses `${{ secrets.DOCKERHUB_USERNAME }}/ci-helloworld:${{ github.sha }}`; set DOCKERHUB_USERNAME and DOCKERHUB_TOKEN secrets in the repo and make the image public.
