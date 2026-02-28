package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptAdd: ImageVector
    get() {
        val current = _receiptAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 6.0f)
                verticalLineToRelative(dy = 2.42f)
                curveTo(x1 = 22.0f, y1 = 10.0f, x2 = 21.0f, y2 = 11.0f, x3 = 19.42f, y3 = 11.0f)
                horizontalLineTo(x = 16.0f)
                verticalLineTo(y = 4.01f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.02f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 2.0f, y = 7.0f)
                verticalLineToRelative(dy = 14.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.6f, dy1 = 0.8f)
                lineToRelative(dx = 1.71f, dy = -1.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.32f, dy1 = 0.1f)
                lineToRelative(dx = 1.66f, dy = 1.67f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.42f, dy1 = 0.0f)
                lineToRelative(dx = 1.68f, dy = -1.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.3f, dy1 = -0.09f)
                lineToRelative(dx = 1.71f, dy = 1.28f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 21.0f)
                verticalLineTo(y = 4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineTo(x = 6.0f)
                curveTo(x1 = 3.0f, y1 = 2.0f, x2 = 2.0f, y2 = 3.79f, x3 = 2.0f, y3 = 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.75f, y = 9.25f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = -2.0f)
                curveTo(x1 = 9.75f, y1 = 6.84f, x2 = 9.41f, y2 = 6.5f, x3 = 9.0f, y3 = 6.5f)
                reflectiveCurveTo(x1 = 8.25f, y1 = 6.84f, x2 = 8.25f, y2 = 7.25f)
                verticalLineToRelative(dy = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveTo(x1 = 5.84f, y1 = 9.25f, x2 = 5.5f, y2 = 9.59f, x3 = 5.5f, y3 = 10.0f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
        }.build().also { _receiptAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptAdd: ImageVector? = null
