package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BucketSquare: ImageVector
    get() {
        val current = _bucketSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BucketSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.18f, y1 = 2.0f, x2 = 2.01f, y2 = 4.17f, x3 = 2.01f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.66f, y = 11.93f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.17f, dy1 = -0.39f)
                lineToRelative(dx = -4.7f, dy = -4.7f)
                lineToRelative(dx = -0.55f, dy = -0.55f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.68f, dy1 = 0.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.68f)
                lineToRelative(dx = 0.55f, dy = 0.55f)
                lineToRelative(dx = -3.6f, dy = 3.6f)
                quadToRelative(dx1 = -0.62f, dy1 = 0.62f, dx2 = -0.64f, dy2 = 1.24f)
                quadToRelative(dx1 = -0.02f, dy1 = 0.66f, dx2 = 0.64f, dy2 = 1.33f)
                lineToRelative(dx = 2.57f, dy = 2.57f)
                quadToRelative(dx1 = 1.3f, dy1 = 1.28f, dx2 = 2.57f, dy2 = 0.0f)
                lineToRelative(dx = 3.85f, dy = -3.85f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.16f, dy1 = -0.48f)
                moveToRelative(dx = 1.3f, dy = 2.26f)
                curveToRelative(dx1 = -0.16f, dy1 = -0.18f, dx2 = -0.47f, dy2 = -0.18f, dx3 = -0.64f, dy3 = 0.0f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.21f, dx2 = -1.2f, dy2 = 1.33f, dx3 = -1.2f, dy3 = 2.17f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.0f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.02f, dy1 = -0.84f, dx2 = -0.96f, dy2 = -1.95f, dx3 = -1.16f, dy3 = -2.17f)
            }
        }.build().also { _bucketSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _bucketSquare: ImageVector? = null
