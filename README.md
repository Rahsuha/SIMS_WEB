Each commit ID should have a pull request and associated Jira story no
Follow the standard branch pattern so that you can maintain your code quality like feature/*, bugfix/*, release/*, master, develop/*, integration/*
Ensure the pull request is reviewed by the reviewer we shouldn’t allow the same person to merge the pull request.
Finally, version that is deployed in production you can tag the commit ID so that for future purposes you will know which version has been released.
Make sure there is no direct commit on any of the branches we should restrict the access. Each change must be committed, and a pull request must be raised and then merged to any branch.


