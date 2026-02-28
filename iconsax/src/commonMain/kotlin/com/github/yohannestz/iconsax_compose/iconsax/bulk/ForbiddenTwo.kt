package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForbiddenTwo: ImageVector
    get() {
        val current = _forbiddenTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForbiddenTwo",
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
                moveTo(x = 14.9f, y = 2.0f)
                horizontalLineTo(x = 9.1f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.88f)
                lineToRelative(dx = -4.1f, dy = 4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 9.1f)
                verticalLineToRelative(dy = 5.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.68f, dx2 = 0.4f, dy2 = 1.64f, dx3 = 0.88f, dy3 = 2.12f)
                lineToRelative(dx = 4.1f, dy = 4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.1f, y1 = 22.0f)
                horizontalLineToRelative(dx = 5.8f)
                curveToRelative(dx1 = 0.68f, dy1 = 0.0f, dx2 = 1.64f, dy2 = -0.4f, dx3 = 2.12f, dy3 = -0.88f)
                lineToRelative(dx = 4.1f, dy = -4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 14.9f)
                verticalLineTo(y = 9.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.68f, dx2 = -0.4f, dy2 = -1.64f, dx3 = -0.88f, dy3 = -2.12f)
                lineToRelative(dx = -4.1f, dy = -4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.9f, y1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.06f, y = 12.0f)
                lineToRelative(dx = 2.97f, dy = -2.97f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineTo(x = 12.0f, y = 10.94f)
                lineTo(x = 9.03f, y = 7.97f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineTo(x = 10.94f, y = 12.0f)
                lineToRelative(dx = -2.97f, dy = 2.97f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineTo(x = 12.0f, y = 13.06f)
                lineToRelative(dx = 2.97f, dy = 2.97f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                close()
            }
        }.build().also { _forbiddenTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _forbiddenTwo: ImageVector? = null
