package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cloud: ImageVector
    get() {
        val current = _cloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cloud",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.48f, y = 10.69f)
                lineTo(x = 2.01f, y = 15.72f)
                arcToRelative(a = 4.05f, b = 4.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.1f, dy1 = -3.75f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.43f, dy1 = -6.11f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.87f, dy1 = -1.8f)
                curveToRelative(dx1 = 2.2f, dy1 = 0.68f, dx2 = 3.73f, dy2 = 2.48f, dx3 = 4.28f, dy3 = 4.98f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.8f, dy1 = 1.65f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.17f, y = 18.74f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.82f, dy1 = 1.48f)
                horizontalLineTo(x = 5.97f)
                arcTo(horizontalEllipseRadius = 4.1f, verticalEllipseRadius = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.03f)
                lineToRelative(dx = 0.01f, dy = -0.3f)
                lineToRelative(dx = 18.47f, dy = -5.04f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.26f, dy1 = 2.22f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.57f, dy1 = 5.83f)
            }
        }.build().also { _cloud = it }
    }

@Suppress("ObjectPropertyName")
private var _cloud: ImageVector? = null
