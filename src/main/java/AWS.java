/*

1)Some Common use-cases of AWS Cloud :
Enterprise IT, Backup & Storage, Big Data Analytics, Web hosting,
Create a Backend for Mobile and Social Apps, also we can have our gaming servers running on cloud.

2)AWS Global infrastructure components :
->AWS regions
->Availability Zones.
->AWS Data Centers
->AWS Edge locations/ppp.

3) a)Factors affecting aws region selection:
-> Compliance, Proximity to users (reduced latency), Not all regions have all the services, Pricing.

b)Availability Zones & Data Centers :
→Each region consist of certain number of availablity zones (min = 3 , max = 6).
→Each availability zones has - one or more decrete data centers (Isolated from each other from disaster).
→Each data centers of availability zones are connected via high bandwidth , ultra low latency network.

c)AWS Points of Presence :
→Amazon has 400+ POP in 90+ cities across  40+ countries.
→Helps to deliver content to end users with lowest latency possible.

#About IAM :
3) IAM  AND AWS CLI :
→ IAM INTRODUCTION:
→IAM (Identity an->IAM - Identity and Access Management, Global Service.
->Group in IAM can contain users and not other groups. (Important)
->Users don't necessarily need to belong to a group. (not a good practice)
->A user can belong to a multiple group.
->We create users and groups to give them permission to use AWS service called IAM permission.
->Users and Groups can be assigned JSON documents called policies.
->This JSON Policy define permissions for the users.
->In AWS we apply least privilege principal:Don't give more permission than a user needs.
->When you create a user in IAM , it will be available everywhere as it is global service.
→Suppose we create a group with a permission - "administrater access "and assigned a user in that group , then that
particular user will also inherit any permission that we set for the group in which it is attached to.
*/





































