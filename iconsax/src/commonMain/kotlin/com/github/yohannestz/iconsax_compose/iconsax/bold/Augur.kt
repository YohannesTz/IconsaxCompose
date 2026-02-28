package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Augur: ImageVector
    get() {
        val current = _augur
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Augur",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = -3.67f, dy = 8.66f)
                lineToRelative(dx = 2.5f, dy = -5.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = -0.41f)
                horizontalLineToRelative(dx = 1.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = 0.41f)
                lineToRelative(dx = 2.5f, dy = 5.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = 1.01f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 11.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = -0.41f)
                lineToRelative(dx = -2.29f, dy = -4.59f)
                horizontalLineToRelative(dx = -0.07f)
                lineToRelative(dx = -2.29f, dy = 4.59f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.35f, dy1 = -0.68f)
                moveToRelative(dx = 9.06f, dy = 4.98f)
                lineToRelative(dx = -5.0f, dy = 3.0f)
                quadToRelative(dx1 = -0.18f, dy1 = 0.1f, dx2 = -0.39f, dy2 = 0.11f)
                curveToRelative(dx1 = -0.21f, dy1 = 0.01f, dx2 = -0.27f, dy2 = -0.04f, dx3 = -0.39f, dy3 = -0.11f)
                lineToRelative(dx = -5.0f, dy = -3.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = -0.98f)
                lineToRelative(dx = 1.0f, dy = -2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = -0.34f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = 1.01f)
                lineToRelative(dx = -0.69f, dy = 1.38f)
                lineTo(x = 12.0f, y = 17.12f)
                lineToRelative(dx = 4.02f, dy = -2.41f)
                lineToRelative(dx = -0.69f, dy = -1.38f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = -1.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = 0.34f)
                lineToRelative(dx = 1.0f, dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.98f)
            }
        }.build().also { _augur = it }
    }

@Suppress("ObjectPropertyName")
private var _augur: ImageVector? = null
