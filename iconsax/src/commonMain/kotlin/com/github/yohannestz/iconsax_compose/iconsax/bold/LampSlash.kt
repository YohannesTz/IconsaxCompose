package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampSlash: ImageVector
    get() {
        val current = _lampSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.7f, y = 4.35f)
                lineToRelative(dx = -9.3f, dy = 9.3f)
                curveToRelative(dx1 = -0.47f, dy1 = 0.47f, dx2 = -1.29f, dy2 = 0.37f, dx3 = -1.59f, dy3 = -0.23f)
                arcToRelative(a = 7.6f, b = 7.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = -3.37f)
                arcToRelative(a = 8.03f, b = 8.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.86f, dy1 = -7.85f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.57f, dy1 = 0.52f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = 1.63f)
                moveToRelative(dx = -0.25f, dy = 16.28f)
                arcToRelative(a = 12.6f, b = 12.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.9f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.86f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.86f, dy1 = 0.48f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 22.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = -1.37f)
                moveToRelative(dx = 5.11f, dy = -18.68f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineTo(x = 3.65f, y = 17.8f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 2.46f, dy = -2.46f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.69f, dy1 = 0.52f)
                verticalLineToRelative(dy = 0.83f)
                curveToRelative(dx1 = -0.01f, dy1 = 0.28f, dx2 = -0.02f, dy2 = 0.71f, dx3 = 0.31f, dy3 = 1.06f)
                curveToRelative(dx1 = 0.35f, dy1 = 0.35f, dx2 = 0.87f, dy2 = 0.4f, dx3 = 1.28f, dy3 = 0.4f)
                horizontalLineToRelative(dx = 5.13f)
                quadToRelative(dx1 = 0.81f, dy1 = 0.0f, dx2 = 1.23f, dy2 = -0.43f)
                curveToRelative(dx1 = 0.39f, dy1 = -0.4f, dx2 = 0.37f, dy2 = -0.9f, dx3 = 0.36f, dy3 = -1.16f)
                verticalLineToRelative(dy = -0.7f)
                curveToRelative(dx1 = 3.11f, dy1 = -2.09f, dx2 = 5.06f, dy2 = -6.5f, dx3 = 3.04f, dy3 = -10.56f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = -1.22f)
                lineToRelative(dx = 2.13f, dy = -2.13f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -1.06f)
            }
        }.build().also { _lampSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _lampSlash: ImageVector? = null
