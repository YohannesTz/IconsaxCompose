package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.24f, y = 3.65f)
                horizontalLineTo(x = 7.76f)
                arcToRelative(a = 4.47f, b = 4.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.47f, dy1 = 4.47f)
                verticalLineToRelative(dy = 9.4f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.76f, y1 = 22.0f)
                horizontalLineToRelative(dx = 8.47f)
                arcToRelative(a = 4.47f, b = 4.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.47f, dy1 = -4.47f)
                verticalLineTo(y = 8.12f)
                arcToRelative(a = 4.46f, b = 4.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.46f, dy1 = -4.47f)
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
