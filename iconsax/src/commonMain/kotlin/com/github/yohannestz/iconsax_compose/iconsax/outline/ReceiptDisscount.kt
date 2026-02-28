package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptDisscount: ImageVector
    get() {
        val current = _receiptDisscount
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptDisscount",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.06f, dy1 = -1.11f)
                lineToRelative(dx = -1.01f, dy = -1.35f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = -0.46f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.3f, y1 = 20.2f)
                lineToRelative(dx = -0.57f, dy = -0.5f)
                lineToRelative(dx = 0.55f, dy = 0.51f)
                curveToRelative(dx1 = -1.45f, dy1 = 1.54f, dx2 = -2.55f, dy2 = 1.42f, dx3 = -3.08f, dy3 = 1.21f)
                reflectiveCurveToRelative(dx1 = -1.45f, dy1 = -0.9f, dx2 = -1.45f, dy2 = -3.12f)
                verticalLineTo(y = 7.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.44f, dx2 = 1.28f, dy2 = -5.79f, dx3 = 5.47f, dy3 = -5.79f)
                horizontalLineToRelative(dx = 7.55f)
                curveToRelative(dx1 = 4.19f, dy1 = 0.0f, dx2 = 5.47f, dy2 = 1.35f, dx3 = 5.47f, dy3 = 5.79f)
                verticalLineTo(y = 18.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.21f, dx2 = -0.91f, dy2 = 2.9f, dx3 = -1.45f, dy3 = 3.12f)
                curveToRelative(dx1 = -0.53f, dy1 = 0.21f, dx2 = -1.63f, dy2 = 0.33f, dx3 = -3.08f, dy3 = -1.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.85f, dy1 = -0.37f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.46f)
                lineToRelative(dx = -1.01f, dy = 1.35f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.05f, dy1 = 1.1f)
                moveToRelative(dx = -3.92f, dy = -4.42f)
                horizontalLineToRelative(dx = 0.13f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = 1.06f)
                lineToRelative(dx = 1.02f, dy = 1.35f)
                curveToRelative(dx1 = 0.49f, dy1 = 0.65f, dx2 = 1.24f, dy2 = 0.65f, dx3 = 1.73f, dy3 = 0.0f)
                lineToRelative(dx = 1.01f, dy = -1.35f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.92f, dy1 = -1.06f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = 0.85f)
                curveToRelative(dx1 = 0.76f, dy1 = 0.81f, dx2 = 1.25f, dy2 = 0.91f, dx3 = 1.43f, dy3 = 0.84f)
                curveToRelative(dx1 = 0.24f, dy1 = -0.1f, dx2 = 0.5f, dy2 = -0.68f, dx3 = 0.5f, dy3 = -1.72f)
                verticalLineTo(y = 7.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.61f, dx2 = -0.63f, dy2 = -4.29f, dx3 = -3.97f, dy3 = -4.29f)
                horizontalLineTo(x = 8.22f)
                curveToRelative(dx1 = -3.34f, dy1 = 0.0f, dx2 = -3.97f, dy2 = 0.68f, dx3 = -3.97f, dy3 = 4.29f)
                verticalLineTo(y = 18.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.05f, dx2 = 0.26f, dy2 = 1.63f, dx3 = 0.5f, dy3 = 1.72f)
                curveToRelative(dx1 = 0.18f, dy1 = 0.07f, dx2 = 0.67f, dy2 = -0.03f, dx3 = 1.43f, dy3 = -0.84f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -0.85f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 14.0f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveTo(x = 9.0f, y = 9.0f)
                curveTo(x1 = 8.44f, y1 = 9.0f, x2 = 8.0f, y2 = 8.55f, x3 = 8.0f, y3 = 8.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = -0.37f, dy = 5.55f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 6.73f, dy = -6.73f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -6.73f, dy = 6.73f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _receiptDisscount = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptDisscount: ImageVector? = null
