package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SecurityCard: ImageVector
    get() {
        val current = _securityCard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SecurityCard",
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
                moveTo(x = 9.42f, y = 2.16f)
                lineToRelative(dx = -5.5f, dy = 2.06f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.9f, dy1 = 2.76f)
                verticalLineToRelative(dy = 8.1f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.17f, dy1 = 2.36f)
                lineToRelative(dx = 5.5f, dy = 4.11f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.53f, dy1 = 0.0f)
                lineToRelative(dx = 5.5f, dy = -4.1f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.18f, dy1 = -2.37f)
                verticalLineToRelative(dy = -8.1f)
                arcTo(horizontalEllipseRadius = 3.2f, verticalEllipseRadius = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 4.22f)
                lineToRelative(dx = -5.5f, dy = -2.06f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.08f, dy1 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.26f, y = 6.76f)
                horizontalLineToRelative(dx = -6.85f)
                lineToRelative(dx = -0.57f, dy = 0.01f)
                curveToRelative(dx1 = -1.72f, dy1 = 0.1f, dx2 = -2.18f, dy2 = 0.73f, dx3 = -2.18f, dy3 = 2.7f)
                verticalLineToRelative(dy = 0.38f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = 0.75f)
                horizontalLineToRelative(dx = 10.84f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 9.85f)
                verticalLineTo(y = 9.46f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.16f, dx2 = -0.55f, dy2 = -2.7f, dx3 = -2.74f, dy3 = -2.7f)
                moveToRelative(dx = -8.84f, dy = 4.94f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 2.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.16f, dx2 = 0.55f, dy2 = 2.71f, dx3 = 2.74f, dy3 = 2.71f)
                horizontalLineToRelative(dx = 6.85f)
                curveToRelative(dx1 = 2.15f, dy1 = 0.0f, dx2 = 2.72f, dy2 = -0.52f, dx3 = 2.74f, dy3 = -2.59f)
                verticalLineToRelative(dy = -2.21f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = -0.75f)
                close()
                moveToRelative(dx = 2.85f, dy = 3.77f)
                horizontalLineToRelative(dx = -1.25f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -0.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.3f, dx2 = 0.24f, dy2 = -0.54f, dx3 = 0.54f, dy3 = -0.54f)
                horizontalLineToRelative(dx = 1.25f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.54f, dy2 = 0.24f, dx3 = 0.54f, dy3 = 0.54f)
                reflectiveCurveToRelative(dx1 = -0.24f, dy1 = 0.54f, dx2 = -0.54f, dy2 = 0.54f)
                moveToRelative(dx = 4.05f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.49f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -0.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.3f, dx2 = 0.24f, dy2 = -0.54f, dx3 = 0.54f, dy3 = -0.54f)
                horizontalLineToRelative(dx = 2.5f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.53f, dy2 = 0.24f, dx3 = 0.53f, dy3 = 0.54f)
                arcToRelative(a = 0.53f, b = 0.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = 0.54f)
            }
        }.build().also { _securityCard = it }
    }

@Suppress("ObjectPropertyName")
private var _securityCard: ImageVector? = null
