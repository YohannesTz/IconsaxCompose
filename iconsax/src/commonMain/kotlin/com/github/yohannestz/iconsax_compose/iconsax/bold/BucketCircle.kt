package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BucketCircle: ImageVector
    get() {
        val current = _bucketCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BucketCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = -0.37f, dy = 14.25f)
                quadToRelative(dx1 = -1.28f, dy1 = 1.28f, dx2 = -2.57f, dy2 = 0.0f)
                lineTo(x = 6.5f, y = 13.68f)
                quadToRelative(dx1 = -0.66f, dy1 = -0.66f, dx2 = -0.64f, dy2 = -1.33f)
                quadToRelative(dx1 = 0.02f, dy1 = -0.63f, dx2 = 0.64f, dy2 = -1.24f)
                lineToRelative(dx = 3.6f, dy = -3.6f)
                lineToRelative(dx = -0.56f, dy = -0.55f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.68f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.68f, dy1 = 0.0f)
                lineToRelative(dx = 0.55f, dy = 0.55f)
                lineToRelative(dx = 4.7f, dy = 4.7f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = 0.39f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.17f, dy1 = 0.47f)
                close()
                moveToRelative(dx = 5.01f, dy = 1.61f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = -1.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.84f, dx2 = 0.99f, dy2 = -1.95f, dx3 = 1.19f, dy3 = -2.17f)
                curveToRelative(dx1 = 0.16f, dy1 = -0.18f, dx2 = 0.47f, dy2 = -0.18f, dx3 = 0.64f, dy3 = 0.0f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.21f, dx2 = 1.19f, dy2 = 1.33f, dx3 = 1.19f, dy3 = 2.17f)
                arcToRelative(a = 1.53f, b = 1.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.52f, dy1 = 1.5f)
            }
        }.build().also { _bucketCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _bucketCircle: ImageVector? = null
