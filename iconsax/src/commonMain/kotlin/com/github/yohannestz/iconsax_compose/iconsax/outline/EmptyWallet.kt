package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmptyWallet: ImageVector
    get() {
        val current = _emptyWallet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmptyWallet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.74f, y = 22.75f)
                horizontalLineTo(x = 6.26f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.51f, dy1 = -4.51f)
                verticalLineToRelative(dy = -6.73f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.26f, y1 = 7.0f)
                horizontalLineToRelative(dx = 11.48f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.51f, dy1 = 4.51f)
                verticalLineToRelative(dy = 1.44f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                horizontalLineToRelative(dx = -2.02f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.37f)
                lineToRelative(dx = -0.01f, dy = 0.01f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.38f, dy1 = 1.02f)
                curveToRelative(dx1 = 0.06f, dy1 = 0.66f, dx2 = 0.69f, dy2 = 1.19f, dx3 = 1.41f, dy3 = 1.19f)
                horizontalLineToRelative(dx = 1.9f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 1.19f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.5f, dx2 = -2.02f, dy2 = 4.52f, dx3 = -4.51f, dy3 = 4.52f)
                moveTo(x = 6.26f, y = 8.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.01f, dy1 = 3.01f)
                verticalLineToRelative(dy = 6.73f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.01f, dy1 = 3.01f)
                horizontalLineToRelative(dx = 11.48f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.01f, dy1 = -3.01f)
                verticalLineTo(y = 17.8f)
                horizontalLineTo(x = 19.6f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -2.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = -2.22f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.97f, dy1 = -0.82f)
                horizontalLineToRelative(dx = 1.27f)
                verticalLineToRelative(dy = -0.69f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.01f, dy1 = -3.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.5f, y = 13.16f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 7.84f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.33f, dy1 = -3.37f)
                lineToRelative(dx = 7.94f, dy = -3.0f)
                arcToRelative(a = 2.64f, b = 2.64f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.58f, dy1 = 2.48f)
                verticalLineToRelative(dy = 3.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 14.1f, y1 = 8.16f, x2 = 14.1f, y2 = 7.75f)
                verticalLineToRelative(dy = -3.8f)
                arcTo(horizontalEllipseRadius = 1.1f, verticalEllipseRadius = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.6f, y1 = 3.0f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = -0.13f)
                lineToRelative(dx = -7.94f, dy = 3.0f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.36f, dy1 = 1.97f)
                verticalLineToRelative(dy = 4.57f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = 0.75f)
                moveToRelative(dx = 17.1f, dy = 4.64f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = -2.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = -2.23f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.96f, dy1 = -0.81f)
                horizontalLineToRelative(dx = 2.08f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 1.77f)
                verticalLineToRelative(dy = 2.06f)
                arcToRelative(a = 1.77f, b = 1.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.72f, dy1 = 1.77f)
                close()
                moveToRelative(dx = 1.93f, dy = -4.1f)
                horizontalLineToRelative(dx = -2.05f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.37f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.4f, dy1 = 1.04f)
                curveToRelative(dx1 = 0.07f, dy1 = 0.66f, dx2 = 0.7f, dy2 = 1.19f, dx3 = 1.42f, dy3 = 1.19f)
                horizontalLineToRelative(dx = 1.96f)
                curveToRelative(dx1 = 0.13f, dy1 = 0.0f, dx2 = 0.25f, dy2 = -0.12f, dx3 = 0.25f, dy3 = -0.27f)
                verticalLineToRelative(dy = -2.06f)
                quadToRelative(dx1 = -0.02f, dy1 = -0.24f, dx2 = -0.28f, dy2 = -0.27f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.0f, y = 12.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 11.25f, x2 = 7.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _emptyWallet = it }
    }

@Suppress("ObjectPropertyName")
private var _emptyWallet: ImageVector? = null
