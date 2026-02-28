package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentNormal: ImageVector
    get() {
        val current = _documentNormal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentNormal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.71f, y = 8.12f)
                verticalLineToRelative(dy = 9.41f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.24f, y1 = 22.0f)
                horizontalLineTo(x = 7.76f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.47f, dy1 = -4.47f)
                verticalLineTo(y = 8.12f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = 0.96f, dy2 = -3.2f, dx3 = 2.37f, dy3 = -3.95f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = 0.65f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.89f, dy1 = 2.89f)
                horizontalLineToRelative(dx = 4.7f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.89f, dy1 = -2.89f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.56f, dx2 = 0.6f, dy2 = -0.91f, dx3 = 1.1f, dy3 = -0.65f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.37f, dy1 = 3.95f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.35f, y = 2.0f)
                horizontalLineToRelative(dx = -4.7f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = 1.88f)
                verticalLineToRelative(dy = 0.94f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.64f, y1 = 6.7f)
                horizontalLineToRelative(dx = 4.71f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.88f, dy1 = -1.88f)
                verticalLineTo(y = 3.88f)
                arcTo(horizontalEllipseRadius = 1.87f, verticalEllipseRadius = 1.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.35f, y1 = 2.0f)
            }
        }.build().also { _documentNormal = it }
    }

@Suppress("ObjectPropertyName")
private var _documentNormal: ImageVector? = null
