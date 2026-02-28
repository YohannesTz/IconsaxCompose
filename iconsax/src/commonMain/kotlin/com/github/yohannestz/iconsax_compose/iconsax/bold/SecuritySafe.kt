package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SecuritySafe: ImageVector
    get() {
        val current = _securitySafe
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SecuritySafe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.91f, y = 11.12f)
                verticalLineTo(y = 6.73f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.39f, dy1 = -2.06f)
                lineToRelative(dx = -5.57f, dy = -2.28f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.91f, dy1 = 0.0f)
                lineTo(x = 4.47f, y = 4.67f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.38f, dy1 = 2.06f)
                verticalLineToRelative(dy = 4.39f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.89f, dx2 = 3.55f, dy2 = 9.47f, dx3 = 8.4f, dy3 = 10.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.02f, dy1 = 0.0f)
                curveToRelative(dx1 = 4.85f, dy1 = -1.34f, dx2 = 8.4f, dy2 = -5.92f, dx3 = 8.4f, dy3 = -10.81f)
                moveToRelative(dx = -8.16f, dy = 1.75f)
                verticalLineToRelative(dy = 2.63f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.63f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 10.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.0f, dy1 = 0.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = 2.37f)
            }
        }.build().also { _securitySafe = it }
    }

@Suppress("ObjectPropertyName")
private var _securitySafe: ImageVector? = null
